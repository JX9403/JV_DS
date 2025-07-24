package XauKyTu;

import java.awt.im.InputSubset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
	
	public static void chuan_hoa_ngay_sinh() {
		String s = sc.nextLine() ;
		
		if( s.charAt(1) == '/') s = '0' + s ;
		if( s.charAt(4) == '/') {
			String s1 = s.substring(0, 3) ;
			String s2 = s.substring(3) ;
			s = s1 + "0" + s2 ;
		}
		
		System.out.println(s);
	}
	
	public static void dem_tu_in_hoa() {
		String s = sc.nextLine() ;
		
		String [] list = s.split(" ") ;
		
		int cnt = 0;
		for( int i = 0; i< list.length ; i++) {
			int isUpper = 1 ;
			for( int j = 0; j < list[i].length() ; j++ ) {
				
				if (!Character.isUpperCase(list[i].charAt(j))){
					isUpper = 0 ;
					break;
				}
			}
			if(isUpper == 1 ) {
				cnt++ ;
			}
		}
		System.out.println(cnt);
	}
	
	public static void liet_ke_tu () {
		String s = sc.nextLine() ;
		
		String [] ls = s.split("[\\\\s.,!?]+") ;
		
		int n = 0 ;
		
		while(n < ls.length - 1) {
			System.out.print(ls[n] + " ");
			n++ ;
		}
		System.out.println(ls[n]);
		
	}
	
	public static String reverse (String s) {
		char[] cs = s.toCharArray() ;
		int l = 0, r = cs.length - 1 ;
		
		while( l < r ) {
			char tmp = cs[l] ;
			cs[l] = cs[r];
			cs[r] = tmp ;
			l++; r--;
		}
		return new String(cs) ;
		
	}
	
	public static void tu_chan() {
		String s = sc.nextLine();
		
		String[] ls = s.split(" ");
		
		for( int i = 0; i < ls.length ; i++) {
			if (i % 2 == 0) {
			    System.out.print(ls[i] + " ");
			} else {
			    System.out.print(reverse(ls[i]) + " ");
			}

		}
		
		
		
	}
	
	public static void sap_xep_ky_tu() {
		String s = sc.nextLine();
		
		String[] ls = s.split(" ");
		
		for( int i = 0; i < ls.length ; i++) {
			
			char [] tmp = ls[i].toCharArray() ;
			
			 Arrays.sort(tmp);
			 
			 String res = new String(tmp);

			 System.out.println(res);
		}
		
		
		
	}
	
	public static void sap_xep_tu() {
		String s = sc.nextLine();
		
		String[] ls = s.split(" ");
		
		Arrays.sort( ls, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				if( a.length() != b.length()) return Integer.compare(b.length(), a.length()) ;
				else return a.compareTo(b) ;
			}
			
		}
		

		);
		for( String x : ls) {
			System.out.println(x);
		}
		
	}
	
	public static void dem_so_luong_tu_khac_nhau() {
		String s = sc.nextLine() ;
		s = s.toLowerCase() ;
		
		String[] ls = s.split(" ") ;
		
		Set<String> se = new HashSet<String>() ;
		
		
		for( int i = 0; i < ls.length ; i++ ) {
			
			se.add(ls[i]) ;
		
		}
		
		System.out.println(se.size());
	}
	
	public static void cac_tu_thuan_nghich() {
		String s = sc.nextLine() ;
		
		String [] ls = s.split(" ") ;
		
		List<String> res = new ArrayList<String>();
		 
		for( int i = 0 ; i < ls.length ; i++) {
			if( is_thuan_nghich(ls[i]) == 1) {
				res.add(ls[i]);
			}
		}
		
//		Collections.sort(res);
		
		Collections.sort(res, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				if( a.length() != b.length()) return b.compareTo(a) ;
				else return b.compareTo(a) ;
				
			}
			
			
		}) ;
		
		for( String x : res) {
			System.out.println(x);
		}
		
	}
	
	public static int is_thuan_nghich(String s) {

		char [] cs = s.toCharArray() ;
		
		int l = 0, r = cs.length - 1;
		
		while( l < r ) {
			char tmp = cs[l]  ;
			cs[l] = cs[r] ;
			cs[r] = tmp ;
			
			l++; r--;
		}
		
		String rev = new String(cs) ;
		
		if( s.equals(rev)) return 1;
		else return 0;
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
//			ky_tu_dau_tien_bi_lap();
//			chuan_hoa_ngay_sinh();
			
//			dem_tu_in_hoa();
			
//			liet_ke_tu();
//			tu_chan();
			
//			sap_xep_ky_tu();
//			sap_xep_tu();
			
//			dem_so_luong_tu_khac_nhau();		
			
			cac_tu_thuan_nghich();
		}
	}
}
