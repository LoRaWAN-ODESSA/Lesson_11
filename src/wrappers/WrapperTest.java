package wrappers;

public class WrapperTest {
    public static void main(String[] args) {
        // TASK 2
        Byte b1 = 70;
        Byte b2 = Byte.valueOf((byte) 70);
        Byte b3 = new Byte((byte) 70);
        Byte b4 = Byte.parseByte("70");
        Short s1 = 30100;
        Short s2 = Short.valueOf((short) 30100);
        Short s3 = new Short((short) 30100);
        Short s4 = Short.parseShort("30100");
        Integer i1 = 467100;
        Integer i2 = Integer.valueOf(467100);
        Integer i3 = new Integer(467100);
        Integer i4 = Integer.parseInt("467100");
        Long l1 = 56001L;
        Long l2 = Long.valueOf(56001);
        Long l3 = new Long(56001);
        Long l4 = Long.parseLong("56001");
        Double d1 = 100.109;
        Double d2 = Double.valueOf(100.109);
        Double d3 = new Double(100.109);
        Double d4 = Double.parseDouble("100.109");
        Float f1 = 102.25f;
        Float f2 = Float.valueOf(102.25f);
        Float f3 = new Float(102.25);
        Float f4 = Float.parseFloat("102.25");
        Character c1 = 75;
        Character c2 = Character.valueOf('K');
        Character c3 = new Character('K');
        Boolean bool1 = false;
        Boolean bool2 = Boolean.valueOf(false);
        Boolean bool3 = new Boolean(false);
        Boolean bool4 = Boolean.parseBoolean("false");

        // TASK 3
        Double numDouble = 234.5674;
        byte simpleB = numDouble.byteValue();
        short simpleS = numDouble.shortValue();
        int simpleI = numDouble.intValue();
        float simpleF = numDouble.floatValue();
        long simpleL = numDouble.longValue();

        // TASK 4
        Double double1 = 0.0;
        Double double2 = 976.9867;
        Double nanValue = double2 / double1;
        Double infinityValue = double1 / double1;
        System.out.println("nanValue = " + nanValue);
        System.out.println("infinityValue = " + infinityValue);
        if(nanValue.isNaN()) {
            System.out.println("Variable nanValue = Nan");
        } else if(nanValue.isInfinite()){
            System.out.println("Variable nanValue = Infinity");
        }
        if(infinityValue.isNaN()) {
            System.out.println("Variable infinityValue = NaN");
        } else if(infinityValue.isInfinite()){
            System.out.println("Variable infinityValue = Infinity");
        }

        // TASK 5
        Long long1 = 120L;
        Long long2 = 120L;
        System.out.println("long1 == long2: " + (long1 == long2));
        long1 = 1200L;
        long2 = 1200L;
        System.out.println("long1 == long2: " + (long1 == long2));
    }
}
