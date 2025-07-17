package XauKyTu;

import java.util.Arrays;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class B59MotSoBaiThaotacVoiString {

	public static Scanner sc = new Scanner(System.in);

	public static void so_dep() {
		String s = sc.nextLine();
		for (int i = 0; i < s.length() - 1; i++) {
			if (Math.abs((s.charAt(i) - '0') - (s.charAt(i+1) - '0')) != 1) {
				System.out.println("0");
				return ;
			}
		}
		System.out.println("1");
	return;
	}
	
	public static void them_dau_phay() {
		String s = sc.nextLine() ;
		String res = "" ;
		 int cnt = 1 ;
		 
		 for( int i = s.length() - 1 ; i >= 0 ; i--) {
			 res += s.charAt(i) ;
			 if( cnt % 3 == 0 && i != 0) res += "," ;
			 cnt++ ;
		 }
		 
		 for( int i = res.length() - 1  ; i >= 0; i--){
			 System.out.print(res.charAt(i));
		 }
	}
	
	public static void sap_xep_chu_so() {
		String s = sc.nextLine();
		char[] arr = s.toCharArray() ;
		
		
		Arrays.sort(arr);
		String s2 = new String(arr) ;
		
		int pos = 0 ;
		
		while( pos < s.length() - 1 && s2.charAt(pos)== '0') {
			pos++ ;
			
		}
		System.out.println(s2.substring(pos));
	}

	public static void in_ra_chu_so () {
		String s = sc.nextLine() ;
		
		String s1 = "", s2 = "" ;
		
		for( int i = 0; i<s.length() ; i++) {
			if( Character.isDigit(s.charAt(i)) == true) {
				s1 += s.charAt(i) ;
			} else if(Character.isAlphabetic(s.charAt(i)) == true) {
				s2+=s.charAt(i) ;
			}
		}
		
		System.out.println(s1);
		System.out.println(s2);
	}
	
	public static void hai_8_tech_va_teo() {
		String s = sc.nextLine();
		String res = "" ;
		 for (int i = 0; i < s.length(); i++) {
		        if ("28tech".indexOf(s.charAt(i)) == -1) {
		            res += s.charAt(i);
		        }
		    }
		System.out.println(res);
	}
	
	public static void chen_vao_vi_tri_k () {
		String s= sc.nextLine() ;
		int k = sc.nextInt();
		
		
		String s1 = s.substring(0, k ) ;
		
		String s2 = s.substring(k) ;
		
		System.out.println(s1+"28tech"+s2);
		
	}
	
	public static void ky_tu_dau_tien_bi_lap () {
		String s = sc.nextLine() ;
		int [] d = new int[256] ;
	
		for( int i = 0; i < 256 ; i++) {
			d[i] = 0 ;
		}
		
		for( int i = 0; i < s.length() ; i ++ ) {
			d[s.charAt(i)]++ ;
			if( d[s.charAt(i)] == 2) {
			
				System.out.println(s.charAt(i));
				return;
			} 
		}
		
	 System.out.println("NONE");
	}
	public static void main(String[] args) {

		int t = 3 ;
		while( t-- > 0) {
//			so_dep() ;
//			them_dau_phay();
//			sap_xep_chu_so();
//			in_ra_chu_so();
//			hai_8_tech_va_teo();
			
//			chen_vao_vi_tri_k();
			ky_tu_dau_tien_bi_lap();
		}
	}
}
