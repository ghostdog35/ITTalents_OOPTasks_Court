package Court;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeSet;

import Jurists.Judge;
import Jurists.Jurist;
import Jurists.Jurist.PostType;
import Jurists.Juryman;
import Jurists.Lawer;

public class Court {
	
	private String name;
	private String addres;
	private ArrayList<Case> cases;
	private HashMap<PostType, TreeSet<Jurist>> jurists;
	
	public Court(String name, String addres) {
		this.name = name;
		this.addres = addres;
		this.cases = new ArrayList();
		this.jurists = new HashMap();
	}
	
	public void addJurist(Jurist j){
		if(!this.jurists.containsKey(j.getPost())){
			this.jurists.put(j.getPost(), new TreeSet<>());
		}
		this.jurists.get(j.getPost()).add(j);
	}

	public void addJury(Case case1) {
		while(jurists.get(PostType.JURYMAN).iterator().hasNext()){
			for (Jurist jur : jurists.get(PostType.JURYMAN)) {
				if(case1.jury.size()>case1.max_count_of_jury){
					System.out.println("No room for more jury");
					return;
				}
				case1.jury.add((Juryman) jur);
			}	
		}
	}
	
	public Lawer getRandomLawer(){
		Random r = new Random();
		int ran = r.nextInt(jurists.get(PostType.LAWER).size());
		Jurist temp = null ;
		int idx=0;
		for (Jurist temp1 : jurists.get(PostType.LAWER)) {
			idx++;
			if(idx == ran){
				temp = temp1;
			}
		} 
		return (Lawer) temp;
		
	}

	@Override
	public String toString() {
		return "Court [name=" + name + ", addres=" + addres + "]";
	}
	
	public void showInfo(){
		System.out.println(this);
		for (Entry<PostType, TreeSet<Jurist>> tree : jurists.entrySet()) {
			System.out.println(tree);
		}
	}

	public Judge getRandomJudge() {
		Random r = new Random();
		int ran = r.nextInt(jurists.get(PostType.JUDGE).size());
		for (int i = 0; i < ran-1; i++) {
			jurists.get(PostType.JUDGE).iterator().next();
		}  
		return (Judge) jurists.get(PostType.JUDGE).iterator().next();
	}
	

}
