package Jurists;

public abstract class Jurist implements Comparable<Jurist> {
	public enum PostType {
		JUDGE, JURYMAN, LAWER, PROSECUTOR
	}
	
	private String name;
	private PostType post;
	private int yearsInternship;
	private int countOfCases;
	
	public Jurist(String name, PostType post, int yearsInternship, int countOfCases) {
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}
		this.yearsInternship = yearsInternship;		
		this.countOfCases = countOfCases;
		this.setPost(yearsInternship,  post, countOfCases);
	}
	
	public void setPost(int years, PostType post,int countOfCases){
		if(post==PostType.JUDGE && years<5){
			System.out.println("Not enough years for Judge!");
			this.post=PostType.JURYMAN;
			return;
		}
		if(post==PostType.PROSECUTOR && years<10){
			System.out.println("Not enough years for Prosecutor!");
			this.post=PostType.JURYMAN;
			return;
		}
		if(post==PostType.LAWER && countOfCases<10){
			System.out.println("Not enough cases for Lawer!");
			this.post=PostType.JURYMAN;
			return;
		}
		this.post=post;
		return;
	}
	
	public void increaseCases(){
		this.countOfCases++;
	}

	public String getName() {
		return name;
	}
	

	public PostType getPost() {
		return post;
	}

	@Override
	public String toString() {
		return "[ " + name + " - " + post + "]";
	}
	
	@Override
	public int compareTo(Jurist o) {
		
		return this.name.compareTo(o.name);
	}
	

}
