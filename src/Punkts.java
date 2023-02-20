import java.util.List;

public class Punkts
{
    public String name_of_punkt;
    public Inside_punkts[] podpunkts;
    public int position;
    public  Punkts(String name, Inside_punkts[] inside, int pos)
    {
        name_of_punkt = name;
        podpunkts = inside;
        position = pos;
    }
}
