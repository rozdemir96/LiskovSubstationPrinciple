public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

interface Cloud{
    void machineLearning();
}

interface Translatable extends Cloud{
    void translate();
}

class AWS implements Translatable{

    @Override
    public void machineLearning() {
        System.out.println("AWS Machine Learning");
    }

    @Override
    public void translate() {
        System.out.println("AWS Translate");
    }
}

class Azure implements Cloud{

    @Override
    public void machineLearning() {
        System.out.println("Azure Machine Learning");
    }


}

class Google implements Translatable{

    @Override
    public void machineLearning() {
        System.out.println("Google Machine Learning");
    }

    @Override
    public void translate() {
        System.out.println("Google Translate");
    }
}