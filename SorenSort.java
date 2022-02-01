
// OBOUNOU LEKOGO NGUIA Benaja Soren
// nguiaSoren
// 01 feb 2022
public class SorenSort{
   
    static void sorenSort(int[] arr) { 
        /// Ascending order
        // the thing is to calculate the number of elements inferior to the current number 
        // and this number will be the index; for example array = {3,8,9,5} 
        // 8 is superior to 2 numbers (3 and 5), 8 new_index in the sorted list should be 2
        // 3 is superior to 0 numbers , 0 new_index in the sorted list should be 0

        /// Decending order

        // the thing is to calculate the number of elements superior to the current number 
        // and this number will be the index; for example array = {3,8,9,5} 
        // 8 is inferior to 1 number (9), 8 new_index in the sorted list should be 1
        // 3 is superior to 3 numbers (8,9,5) , 3 new_index in the sorted list should be 3
        int n = arr.length;  
        int index = 0; 
        int[] newArray = new int[n];
        
         for(int i=0; i < n; i++){
             for(int j = 0; j < n; j++){
                // compare current number to all numbers
                if (arr[i] > arr[j]){
                    // increment
                    index++;
                }
            }
            newArray[index] = arr[i];
            index = 0;
        }
        
        for (int i = 0; i < n; i++){
            arr[i] = newArray[i];
        }   
    }
     
    public static void main(String[] args) {  
        int arr[] ={3,60,35,2,45,320,5,1000,345,780,987,341,762};  
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
                    
        sorenSort(arr);//sorting array elements using soren sort  
                     
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
       
    } 

}
 
 
  
