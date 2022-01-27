package Hashcode;
import java.util.*;

import Hashcode.Customer;

import java.io.*;



public class pizza{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
    public int Score(String[] ans,Customer[] cus){
        

        return 0;
    }
    public static void main(String[] args) {
        try {
            
            HashMap<String,Integer>likes=new HashMap<>();
            HashMap<String,Integer>dislikes=new HashMap<>();
            Reader reader=new Reader();
            List<Customer>cus=reader.getinput("a_an_example.in.txt");
            System.out.println(cus.get(0).likes);
            
            // while(testCases-- > 0){
            //     String[] a=in.nextLine().split(" ");
            //     String[] b=in.nextLine().split(" ");
            //     int n=Integer.parseInt(a[0]);
            //     for(int i=1;i<n+1;i++){
            //         likes.put(a[i],likes.getOrDefault(a[i],0)+1);
            //     }
            //     n=Integer.parseInt(b[0]);
            //     for(int i=1;i<n+1;i++){
            //         dislikes.put(b[i],dislikes.getOrDefault(b[i],0)+1);
            //     }
            //     customer[testCases]=new Customer(Arrays.copyOfRange(a, 1, a.length),Arrays.copyOfRange(b, 1, b.length));

                
            // }
            System.out.println(likes);
            System.out.println(dislikes);
            
        } catch (Exception e) {
            return;
        }
    }
}
