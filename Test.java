public class Test {
    public static void main(String[]args)
    {
        ICreateDocument ifactory = new IDocumentFactory();
        TextDocument file = ifactory.NewLaunch();
        file.Launch();
    }
}