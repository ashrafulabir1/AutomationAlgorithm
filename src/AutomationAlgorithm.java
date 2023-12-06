//Expected output: 1,4,5,5,2,1,2,4,1,5
public class AutomationAlgorithm {

	public static void main(String[] args) {
		
			    int x[] = {1,2,3,4,5};
			    int y[] = {1,4,5,9,8,5,6,2,1,2,4,1,5};
			    int i=0;
			    int j=0;
			    System.out.println("Matched Value in both array:\n");
			    do {
			        for(i=0;i<x.length;i++) {
			            for(j=0;j<y.length;j++) {
			            if(y[j] == x[i]) {
			                System.out.println(+x[i]);
			               
			            }           
			            }
			        }
			    }
				while(i<x.length); 

	}

}
