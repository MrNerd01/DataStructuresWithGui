/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serial.search;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author swarathesh60
 */
public class search {
    int[] a;
    long endTime;
    
    void initiateArray(int n ){
        a = new int[n];
        Random random = new Random();
        
     for(int i = 0 ; i < a.length ; i++){
         a[i] = random.nextInt(50)+1;
     }
     Arrays.sort(a);
  }
    String returnA(){
        return Arrays.toString(a);
    }
    
    boolean Searchresult(int key ){
        long start = System.nanoTime();
        
        int found = 0;
        //linear search 
//       1,2,3,4,5,6,7, 
//        
//        for(int i = 0 ; i < a.length ; i++ ){
//            if(a[i]==key){
//                found=1;
//                break;
//            }
//        }
//        endTime = System.nanoTime()- start;

 //binary search 
 int left  = 0 , right = a.length-1,mid;
 while(left<right){
     mid = (left+right)/2;
     if(a[mid]==key){
        found = 1;
        break; 
       }else if (a[mid]<key){
           left = mid +1;
       }else{
           right = mid -1 ;
      }
  }
 endTime = System.nanoTime() - start;
         if(found==1){
            return true;
        }
        else{
            return false;
      }
   
       
  }
}
