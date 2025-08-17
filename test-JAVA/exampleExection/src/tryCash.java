public class tryCash {
    public void sampleTryCash(){
        try {
            float a = 10;
            float b = 50;
            float c;
            c = a/b;

            System.out.println("Resultado: "+ c);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
