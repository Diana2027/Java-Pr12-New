public class IDocumentFactory implements ICreateDocument
{
    public TextDocument NewLaunch()
    {
        return new TextDocument();
    }
}