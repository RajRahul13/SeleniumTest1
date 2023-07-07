
public class WrapperClassAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in=10;
		//boxing
		Integer a = new Integer(in);
		//unboxing
		int bt = a.intValue();
		
		System.out.println(in+" "+a+" "+bt);
		
		char ch='a';
		//boxing
		Character ca = new Character(ch);
		//unboxing
		char cb = ca.charValue();
		
		System.out.println(ch+" "+ca+" "+cb);
		
		byte by=20;
		Byte bya=new Byte(by);
		byte byb=bya.byteValue();
		
		System.out.println(by+" "+bya+" "+byb);
		
		short sh=30;
		Short sa=new Short(sh);
		short sb=sa.shortValue();
		
		System.out.println(sh+" "+sa+" "+sb);
		
		long lo = 2000;
		Long la = new Long(lo);
		long lb = la.longValue();
		
		System.out.println(lo+" "+la+" "+lb);
		
		float fl=2.30f;
		Float fa=new Float(fl);
		float fb=fa.floatValue();
		
		System.out.println(fl+" "+fa+" "+fb);
		
		double dl=34.45;
		Double da = new Double(dl);
		double db = da.doubleValue();
		
		System.out.println(dl+" "+da+" "+db);
		
		boolean bo=true;
		Boolean boa = new Boolean(bo);
		boolean bob = boa.booleanValue();
		
		System.out.println(bo+" "+boa+" "+bob);
		
		//------------------------------------------------------------------
		
		byte b=10;  
		short s=20;  
		int i=30;  
		long l=40;  
		float f=50.0F;  
		double d=60.0D;  
		char c='a';  
		boolean b2=true;  
		  
		//Autoboxing: Converting primitives into objects  
		
		Byte byteobj=b;  
		Short shortobj=s;  
		Integer intobj=i;  
		Long longobj=l;  
		Float floatobj=f;  
		Double doubleobj=d;  
		Character charobj=c;  
		Boolean boolobj=b2;  
		  
		//Printing objects  
		System.out.println("---Printing object values---");  
		System.out.println("Byte object: "+byteobj);  
		System.out.println("Short object: "+shortobj);  
		System.out.println("Integer object: "+intobj);  
		System.out.println("Long object: "+longobj);  
		System.out.println("Float object: "+floatobj);  
		System.out.println("Double object: "+doubleobj);  
		System.out.println("Character object: "+charobj);  
		System.out.println("Boolean object: "+boolobj);  
		  
		//Unboxing: Converting Objects to Primitives  
		byte bytevalue=byteobj;  
		short shortvalue=shortobj;  
		int intvalue=intobj;  
		long longvalue=longobj;  
		float floatvalue=floatobj;  
		double doublevalue=doubleobj;  
		char charvalue=charobj;  
		boolean boolvalue=boolobj;  
		  
		//Printing primitives  
		System.out.println("---Printing primitive values---");  
		System.out.println("byte value: "+bytevalue);  
		System.out.println("short value: "+shortvalue);  
		System.out.println("int value: "+intvalue);  
		System.out.println("long value: "+longvalue);  
		System.out.println("float value: "+floatvalue);  
		System.out.println("double value: "+doublevalue);  
		System.out.println("char value: "+charvalue);  
		System.out.println("boolean value: "+boolvalue);  
		
		}
		
		
}
