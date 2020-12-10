import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextDocument implements IDocument
{
    private int num = 1;
    private String file;
    private String text;

    public void Launch()
    {
        new File().setVisible(true);
    }

    public void New()
    {
        file = "File" + String.valueOf(num) + ".txt";
        num++;
        try
        {
            Files.createFile(Path.of("d:\\Pr12\\src\\Directoria\\" + file));
            System.out.println("Новый файл создан!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void Read()
    {
        try (FileInputStream f = new FileInputStream("d:\\Pr12\\src\\Directoria\\" + file))
        {
            System.out.println("Содержимое файла:");
            int b;
            do {
                b = f.read();
                if (b != -1)
                {
                    System.out.print((char) b);
                }
            }
            while (b != -1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void Write()
    {
        text = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("Введите строку, которую хотите записать в файл:");
            text = reader.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void Save()
    {
        if (text != "")
        {
            try(FileWriter writer = new FileWriter("d:\\Pr12\\src\\Directoria\\" + file, true))
            {
                String lineSeparator = System.getProperty("line.separator");
                writer.write(text + lineSeparator);
                writer.flush();
                System.out.println("Изменения в файле сохранены!");
            }
            catch(IOException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        text = "";
    }

    public void Exit()
    {
        System.out.println("Выход из системы!");
        System.exit(0);
    }
}