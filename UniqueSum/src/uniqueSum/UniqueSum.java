package uniqueSum;

public class UniqueSum{ 

    public static int sumOfDistinct(int a[], int n) 
    { 
        int sum = 0; 
        for (int i = 0; i < n; i++) { 
      
            if (a[Math.abs(a[i]) - 1] >= 0) { 
                sum += Math.abs(a[i]); 
                a[Math.abs(a[i]) - 1] *= -1; 
            } 
        } 
      
        return sum; 
    } 
  
 
    public static void main(String args[]) 
    { 
        int a[] = { 5, 1, 2, 4, 6, 7, 3, 6, 7 }; 
        int n = a.length; 
        System.out.println(sumOfDistinct(a, n) ); 
    } 
} 