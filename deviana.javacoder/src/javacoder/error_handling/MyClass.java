package javacoder.error_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;

public class MyClass {
	public void index() {
		String[] data = new String[3];
		data[0] = "hallo";
		data[1] = "world";
		data[2] = "xsis";
		Connection con = null;

		try {
			con = DriverManager.getConnection(null);
			data[3] = "mitra";
			data[4] = "utama";
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("set to array");
		System.out.println(Arrays.toString(data));
	}

	public void index2() {
		String data = "";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String[] datas = new String[1];
		try {
			data = br.readLine();
			int angka = Integer.parseInt(data);
			datas[0] = "hallo1";
			datas[1] = "world2";
		} catch (NumberFormatException e) {
			System.err.println("error :" + e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.err.println("terjadi pada index array");
		} catch (Exception e) {
			System.err.println("terjadi error");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("name" + datas);
	}

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.index2();
	}
}
