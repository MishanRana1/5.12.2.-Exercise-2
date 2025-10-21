import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PoemWriter {

    public static void main(String[] args){

        Poem poem1 = new Poem("The Road Not Taken", "Robert Frost");
        Poem poem2 = new Poem("Still I rise", "Maya Angelou");
        Poem poem3 = new Poem("Ozymandias", "Percy Bysshe Shelley");

        Poem[] poems = {poem1, poem2, poem3};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Poems.txt"))){
            
            for (Poem poem : poems){
                bw.write(poem.getName());
                bw.newLine();
                bw.write(poem.getPoet());
                bw.newLine();
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}