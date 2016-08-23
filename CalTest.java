/**
 * 
 */
package comt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



/**
 * @author S00343
 *
 */
public class CalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Calendar cal = Calendar.getInstance();
		Calendar schDate = Calendar.getInstance();
		schDate.set(Calendar.DAY_OF_MONTH, 30);
		schDate.set(Calendar.MONTH, 6);
		schDate.set(Calendar.YEAR, 2016);
		System.out.println(cal.getTimeInMillis());
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setTimeInMillis(1442305948101l);
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String date1 = format1.format(cal1.getTime());
		System.out.println(date1);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTimeInMillis(1467267201539l);
		
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
		String date2 = format2.format(cal2.getTime());
		System.out.println(date2);*/
		
		
		Calendar schDate = Calendar.getInstance();
		schDate.set(Calendar.DAY_OF_MONTH, 23);
		schDate.set(Calendar.MONTH, 7);
		schDate.set(Calendar.YEAR, 2016);
		schDate.set(Calendar.HOUR_OF_DAY, 0);
		schDate.set(Calendar.MINUTE, 0);
		schDate.set(Calendar.SECOND, 0);
		System.out.println(schDate.getTimeInMillis());
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setTimeInMillis(1471809600911l);
		
		Map map = new HashMap();
		map.put(null,"A");
		map.put(null,"B");
		System.out.println(map);
		System.out.println(map);
		
		
		List a = new ArrayList();
		a.add("");
		
		
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String date1 = format1.format(cal1.getTime());
		System.out.println(date1);
		
		List sorLst = new ArrayList();
		Shipment s = new Shipment();
s.setPieces(2);
sorLst.add(s);
		Shipment s1 = new Shipment();
		s1.setPieces(9);
		sorLst.add(s1);
		Shipment s2 = new Shipment();
		s2.setPieces(3);
		sorLst.add(s2);
		Shipment s3 = new Shipment();
		s3.setPieces(15);
		sorLst.add(s3);
		Shipment s4 = new Shipment();
		s4.setPieces(12);
		sorLst.add(s4);
		System.out.println(sorLst);
		java.util.Collections.sort(sorLst, new InboundAllShipmentDtoComparator());
		System.out.println(sorLst);
	}
	
	public static class Shipment{
		int pieces;
		
		Shipment(){
			
		}

		/**
		 * @return the pieces
		 */
		public int getPieces() {
			return pieces;
		}

		/**
		 * @param pieces the pieces to set
		 */
		public void setPieces(int pieces) {
			this.pieces = pieces;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return getPieces()+"";
		}
		
		
	}
	public static class InboundAllShipmentDtoComparator implements Comparator {
		//// Comparator Method ////////////////////////
		public int compare(Object inboundAllShpmtn1, Object inboundAllShpmtn2) {
			if (((Shipment) inboundAllShpmtn1).getPieces() < ((Shipment) inboundAllShpmtn2)
					.getPieces()) {
				return 1;
			} else if (((Shipment) inboundAllShpmtn1)
					.getPieces() > ((Shipment) inboundAllShpmtn2).getPieces()) {
				return -1;
			} else {
				return 0;
			}

		}
	}

}
