import java.io.*;
import java.util.*;

class CowGym {
  public static void main(String[] args) throws IOException{
     BufferedReader br = new BufferedReader(new FileReader("gymnastics.in"));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int sessionnum = Integer.parseInt(st.nextToken());
    int cowsnum = Integer.parseInt(st.nextToken());
    int[][] data = new int[sessionnum][cowsnum]; 

    for (int i=0; i<sessionnum; i++){
      st = new StringTokenizer(br.readLine());
      for (int w=0; w<cowsnum; w++){
        data[i][w] = Integer.parseInt(st.nextToken());
      }
    }


    int counter = 0;
    // Go through all pairs.
		for (int i=0; i<cowsnum; i++) {
			for (int w=i+1; w<cowsnum; w++) {
			
				// See how many times cowi beats cowj.
				int iBeatw = 0;
				for (int k=0; k<sessionnum; k++)
					if (data[k][i] < data[k][w])
						iBeatw++;
						
				// 0 or all is same
				if (iBeatw == 0 || iBeatw == sessionnum)
					counter++;
			}
		}

    System.out.println(counter); 
    
    
  }
}