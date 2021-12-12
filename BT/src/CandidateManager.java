import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;
@SuppressWarnings("unchecked")
public class CandidateManager {
    
    private ArrayList<Candidate> candidates;

    
    public CandidateManager() {
        this.candidates = new ArrayList<>();
    }
    
    /*
    readData
    doc du lieu tu file van ban textFile va luu du lieu vao cac bien thanh vien
    */
    public boolean readData(String textFile) {
        try {
            File file = new File(textFile);
            Scanner fileReader = new Scanner(file);
            
            while (fileReader.hasNextLine()) {
                String[] fields = fileReader.nextLine().trim().split("\\|");
                if (fields.length != 6) {
                    continue;
                }
                String id = fields[0].trim();
                String name = fields[1].trim();
                String selection = fields[2].trim();
                String sex = fields[3].trim();
                int year = Integer.parseInt(fields[4].trim());
                int priority = Integer.parseInt(fields[5].trim());
                
                Candidate newCandidate = new Candidate(id, name, selection, sex, year, priority);
                this.candidates.add(newCandidate);
            }
            
            fileReader.close();
            return true;
        } catch(IOException ex) {
            System.out.println("Error reading file '" + textFile + "'");
            return false;
        }  
    }
    
    /* 
    getSelectionCandicates 
    trả về danh sách các thí sinh có khối thi là selection 
    */
    public ArrayList<Candidate> getSelectionCandicates(String selection) { 
        
        /* Todo */
    	ArrayList<Candidate> ca = new ArrayList<>();
    	for (Candidate candidate : candidates) {
			if(candidate.selection().equals(selection))
				ca.add(candidate);
		}
        return ca;
    }
    
    /* 
    getPriorityCandidates 
    trả về danh sách thí sinh được ưu tiên (có độ ưu tiên bằng 1)
    */
    public ArrayList<Candidate> getPriorityCandidates() {
        
        /* Todo */
    	ArrayList<Candidate> ca = new ArrayList<>();
    	for (Candidate candidate : candidates) {
			if(candidate.priority()==1)
				ca.add(candidate);
		}
        return ca;
    }
    
    /* 
    sortByName 
    tra ve danh sach cac thi sinh duoc sap xep theo ho va ten (name)
    */
    public ArrayList<Candidate> sortByName() {
        
        /* Todo */
    	
    	ArrayList<Candidate> candidates1 = (ArrayList<Candidate>) candidates.clone();
        for(int i = 0; i < candidates1.size()-1; i++) {
        	for(int j = 0; j < candidates1.size()-i-1; j++) {
        		if(candidates1.get(j).name().compareTo(candidates1.get(j+1).name())>0) {
        			Collections.swap(candidates1, j, j+1);
        		}
        	}
        }
        return candidates1;
    }
    
    /* 
    getSecondYoungestCandidates 
    trả về danh sách các thí sinh có tuổi trẻ thứ 2 trong danh sách 
    (ví dụ: các khách hàng có các năm sinh 1990 1991 1992 1993, 
    trả về danh sách các khách hàng sinh năm 1992)
    */
    public ArrayList<Candidate> getSecondYoungestCandidates() {
        
        /* Todo */
    	ArrayList<Integer> years = new ArrayList<Integer>();
        for(int i = 0; i < candidates.size(); i++) {
        	if (!years.contains(candidates.get(i).year()))
        		years.add(candidates.get(i).year());
        }
       
        Collections.sort(years, Collections.reverseOrder()); // the nay la giam dan
//    	ArrayList<Candidate> sec = new ArrayList<>();
//    	
//    	
//    	for (Candidate candidate : candidates) {
//			if(candidate.year() == max2)
//				sec.add(candidate);
//		}
        
        ArrayList<Candidate> sec = new ArrayList<>();
        for (Candidate c : candidates) {
			if(c.year() == years.get(1)) {
				sec.add(c);
			}
		}
        
    	return sec;
        
    }
    
    /*
    printCandidatesFromArray 
    in danh sach cac thi sinh tu mot List da cho
    */
    public void printCandidatesFromArray(ArrayList<Candidate> candidates) {
        if (candidates == null) {
            return;
        }
        
        for (int i = 0; i < candidates.size(); i++) {
            candidates.get(i).print();
        }
    }
    
    /*
    printCandidates 
    in danh cach cac thi sinh duoc luu trong bien thanh vien candidates
    */
    public void printCandidates() {
        printCandidatesFromArray(this.candidates);
    }
    
    public static void main(String[] args) {
        CandidateManager candidateManager = new CandidateManager();
        if (!candidateManager.readData("candidates.txt")) {
            return;
        }

        //ArrayList<Candidate> selectionCandidates = candidateManager.getSelectionCandicates("A");
        //candidateManager.printCandidatesFromArray(selectionCandidates);
        //System.out.println();
        
        //ArrayList<Candidate> priorityCandidates = candidateManager.getPriorityCandidates();
        //candidateManager.printCandidatesFromArray(priorityCandidates);
        //System.out.println();
            
        //ArrayList<Candidate> sortedNameCandidates = candidateManager.sortByName();
        //candidateManager.printCandidatesFromArray(sortedNameCandidates);
        //System.out.println();
            
        //ArrayList<Candidate> secondYoungestCandidates = candidateManager.getSecondYoungestCandidates();
        //candidateManager.printCandidatesFromArray(secondYoungestCandidates);
    }
}