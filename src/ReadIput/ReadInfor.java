package ReadIput;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ReadInfor {
	public ArrayList<String> readf(String path)
	{
		ArrayList<String> list = new ArrayList<String>();
		java.net.URL url = getClass().getResource(path);
		//System.out.println(url.toString());
		try {
			BufferedReader br = new BufferedReader(
			        new InputStreamReader(url.openStream(),"UTF-8"));
			String line = null;
			while ((line = br.readLine())!=null) {
				list.add(line);
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			//JOptionPane.showMessageDialog(null, "Lỗi tải file","Thông báo",JOptionPane.ERROR_MESSAGE);
		}
		return list;
	}
	
	public ArrayList<String> readPath(String name){
		ArrayList<String> list = new ArrayList<String>();
		//java.net.URL url = getClass().getResource(path);
		File f = new File(getClass().getResource("/"+name).getPath());
		if (f.isDirectory()) {
			File[] lf = f.listFiles();
			for (File i : lf) {
				list.add("/"+name+"/"+i.getName());
			}
		}
		
		return list;
	}
//	public static void main(String[] args) {
//		ReadInfor ri = new ReadInfor();
//		for(String t : ri.readPath("Languages"))
//			System.out.println(t);
//	}
}
