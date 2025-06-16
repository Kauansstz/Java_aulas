public class aula_10 {
    public static void main(String[] args) {
        //Byte
        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt("10000");
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("True");
        System.out.println(bo);

        Character c = '#';
        System.out.println(c);
    }
}
