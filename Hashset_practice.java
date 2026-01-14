import java.util.*;
public class Hashset_practice {
	
	void substring(String s) {
		int left=0;
		int maxsize=0;
		HashSet<Character> set=new HashSet<>();
		for(int right=0;right<s.length();right++ ) {
			char c=s.charAt(right);
			while(set.contains(c)) {
				set.remove(s.charAt(left));
				left++;
			}
			
			set.add(c);
			maxsize=Math.max(maxsize, (right-left)+1);
			
		}
		System.out.println("Maximum sub string of size is: "+maxsize);
	}
	
	void practice() {
		HashSet<String> sets=new HashSet<>();
		sets.add("jagadeesh");
		sets.add("vijay");
		sets.add("vivek");
		sets.add("naveen");
		sets.add("jagadeesh");
		System.out.println(sets);
		System.out.println(sets.size());
		System.out.println(sets.isEmpty());
		System.out.println(sets.remove("jagadeesh"));
		System.out.println(sets);
		sets.add("Jagadeesh");
		System.out.println(sets);
		sets.clone();
		System.out.println(sets);
		sets.add("jagadeesh");
		System.out.println(sets.contains("jagadeesh"));
		System.out.println(sets.contains("naveen"));
		System.out.println(sets.contains("vijay"));
		sets.remove("vijay");
		System.out.println(sets.contains("vijay"));
		
	}
	
	int findduplicates(int[] arr) {
		if(arr.length==0)return 0;
		HashSet<Integer> intset=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			System.out.println(intset);
			if(intset.contains(arr[i])) {
				return arr[i];
			}
			intset.add(arr[i]);
		}
		return -1;
	}
	
	boolean Anagramcheck(String s1,String s2) {
		HashSet<Character> charset=new HashSet<>();
		if(s1.length()!=s2.length())return false;
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			charset.add(c);
		}
		for(int i=0;i<s2.length();i++) {
			char c=s2.charAt(i);
			if(charset.contains(c)) {
				charset.remove(c);
			}
		}
		
		return charset.isEmpty();
	}
	
	boolean checkduplicates(int arr[]) {
		HashSet<Integer> intset=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(intset.contains(arr[i])) {
				return true;
			}
			intset.add(arr[i]);
		}
		return false;
	}
	
	String removeduplicateinString(String s) {
		HashSet<Character> seen=new HashSet<>();
		StringBuilder result=new StringBuilder();
		for(char c:s.toCharArray()) {
			if(!seen.contains(c)) {
				seen.add(c);
				result.append(c);
			}
		}
		
		return result.toString();
	}
	
	ArrayList<Integer> unionOfTwoArrays(int[] arr1,int[] arr2) {
		if(arr1.length==0 && arr2.length==0)return new ArrayList<>();
		HashSet<Integer> set=new HashSet<>();
		ArrayList<Integer> result=new ArrayList<>(); 
		for(int i=0;i<arr1.length;i++) {
			if(!set.contains(arr1[i])) {
			set.add(arr1[i]);	
		}
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(set.contains(arr2[i])) {
			result.add(arr2[i]);	
		}
		}
		
		return result;
	}
	
	ArrayList<Integer> Intersectionoftwoarrays(int[] arr1,int[] arr2){
		HashSet<Integer> set=new HashSet<>();
		HashSet<Integer> resultset=new HashSet<>();
		if(arr1.length==0||arr2.length==0)return new ArrayList<>();
		
		for(int i=0;i<arr1.length;i++) {
			if(!set.contains(arr1[i])) {
				set.add(arr1[i]);
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(set.contains(arr2[i])) {
				resultset.add(arr2[i]);
			}
		}
		return new ArrayList<>(resultset);
	}
	
	boolean twoSumChecker(int[] arr,int target) {
		HashSet<Integer> seen=new HashSet<>();
		if(arr.length==0)return false;
		for(int num:arr) {
			int complement=target-num;
			if(seen.contains(complement)) {
				return true;
			}
			seen.add(num);
		}
		return false;
	}
	
	int Longestsubsequence(int[] arr){
		if(arr.length==0)return 0;
		HashSet<Integer> set=new HashSet<>();
		for(int num:arr) {
				set.add(num);
		}
		int longstreak=0;
		for(int num:set) {
			if(!set.contains(num-1)) {
				int currentnum=num;
				int currentstreak=1;
			while(set.contains(currentnum+1)) {
				currentnum++;
				currentstreak++;
			}
			longstreak=Math.max(longstreak,currentstreak);
			}
			
		}
		
		return longstreak;
	}
public static void main(String args[]) {
	
	Hashset_practice obj=new Hashset_practice();
//int res=obj.findduplicates(new int[] {1,2,3,4,5,1});
//System.out.println("Duplicate element in given array is:"+res);
//	obj.substring("abcabccddb");
//obj.practice();
	//System.out.println(obj.Anagramcheck("silent", "listen"));
	//System.out.println(obj.checkduplicates(new int[] {1,2,3,4,5,1}));
	//System.out.println(obj.removeduplicateinString("programming"));
	
//	int[] arr1= {1,2,3};
//	int[] arr2= {2,3,4};
//	System.out.println(obj.unionOfTwoArrays(arr1,arr2));
//	 int[] arr1 = {1, 2, 2, 3, 4};
//     int[] arr2 = {2, 2, 3, 5};
//     System.out.println(obj.Intersectionoftwoarrays(arr1,arr2));
//	int[] arr= {1,4,7,12};
//	System.out.println(obj.twoSumChecker(arr,8));
//	int[] arr= {1,2,500,6,3,4,5,100};
//	System.out.println(obj.Longestsubsequence(arr));
//	for(int i=1;i<=obj.Longestsubsequence(arr);i++) {
//		System.out.print(i+" ");
//	}
}
}

/* 
linked list question





 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class SwappingNodes {
    public static ListNode swapNodes(ListNode head, int k) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int arr[]=new int[size];
        temp=head;
        int i=0;
        int n=arr.length;
        while(temp!=null){
            arr[i++]=temp.val;
            temp=temp.next;
        }
        int t=arr[k-1];
        arr[k-1]=arr[size-k];
        arr[size-k]=t;
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        int j=0;
        while(j<arr.length){
            current.next=new ListNode(arr[j]);
            current=current.next;
            j++;
        }
        return dummy.next;
        
    }

    static ListNode creation(int[] arr){
        if(arr.length==0)return new ListNode();
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        for(int i=0;i<arr.length;i++){
            current.next=new ListNode(arr[i]);
            current=current.next;
        }
        return dummy.next;
    }
    public static void main(String args[]){
        ListNode l1=creation(new int[]{1,2,3,4,5});
        ListNode result=swapNodes(l1, 2);
        while(result!=null){
            System.out.print(result.val+" ");
            result=result.next;
        }

    }
}
*/
