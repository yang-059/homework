package zuoYeChuLi;

import java.io.*;
import java.util.*;

public class ZuoYeChuLi {
    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Student> studentArray = new ArrayList<Student>();
		try {
			Student one = new Student();
			Scanner scanner = new Scanner(System.in);
			System.out.println("��������Ҫ���ĵ��в�ѯ�ĺ��ֻ���");
			wordForSearch=scanner.nextLine();
			System.out.print("������ѧ��������");
			String str = scanner.nextLine();
			one.setName(str);
			System.out.print("�������Ա�");
			String gender = scanner.nextLine();
			one.setGender(gender);
			System.out.print("���������䣺");
			int age = scanner.nextInt();
			one.setAge(age);
			System.out.print("������ѧ�ţ�");
			int num = scanner.nextInt();
			one.setNum(num);
			studentArray.add(one);
			System.out.println("��ѧ��������Ϣ�ѳɹ��ύ����ҵ�ĵ���");
		}catch(InputMismatchException ime){
			System.out.print("�����������ʹ���\n");
		}
		   InputStreamReader ir =new InputStreamReader(new FileInputStream("D:/B.txt"), "UTF-8");
	       BufferedReader bf = new BufferedReader(ir);
	       String poem=bf.readLine();
	       StringBuffer sb=new StringBuffer();
	       sb.append(poem);  
	       	int i;
			int j=0; 
			for(i=7;i<=sb.length();i+=8){
					if(i==7){
						sb.insert(i, ",");
					}else if((i-j)%7==0&&(i-j)%14!=0){
						sb.insert(i,",");
					} else if((i-j)%14==0){
						sb.insert(i,"��");
	    		    }
	    	 j=j+1;
	    } 
	       File destPath = new File("D:/A.txt");
	        BufferedWriter bw = new BufferedWriter(new FileWriter(destPath));  
	        bw.write("==========������Ϣ:==========");
	        bw.newLine();
	        bw.write("����\t");
	        bw.write("�Ա�\t");
	        bw.write("����\t");
	        bw.write("ѧ��\t");
	        bw.newLine();
	        bw.flush();
	        for (Student one : studentArray) {
	            String name = one.getName();
	            String gender = one.getGender();
	            int age = one.getAge();
	            int num = one.getNum();
	            bw.write(name + "\t");
	            bw.write(gender + "\t");
	            bw.write(age + "\t");
	            bw.write(num + "\t");
	            bw.newLine();
	            bw.flush();
	        }
	        bw.write("==========��ҵ����:==========");
	        bw.newLine();
	        bw.append(sb.toString());
	        bw.close();
	        
	     	
	        InputStreamReader ir2 =new InputStreamReader(new FileInputStream("D:/B.txt"), "UTF-8");
		    BufferedReader bf2 = new BufferedReader(ir2);
		    String poemForSearch=bf2.readLine();
		    int count = GetCount(poemForSearch, wordForSearch);
		    System.out.println(wordForSearch + "������ַ���������" + count+"��");
	}
	static String wordForSearch;
	static int GetCount(String source,String wordForSearch){
	   	   int i, j, count = 0;
	   	   int len1 = source.length(); 
	   	   int len2 = wordForSearch.length(); 
	   	   for(i=0; i<len1-len2; i++){
	   	   for(j=0; j<len2; j++){ 
	   		   if(wordForSearch.charAt(j) != source.charAt(j + i)){
	   			   break;
	   		   		}
	   	   		}
	   	   		if(j>=wordForSearch.length()){
	   	   			count++;
	   	   			}
	   	   		}
	   	   return count;
	  }

}

class Student {
	String name;
	int num;
	int age;
	String gender;

	Student() {
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


}