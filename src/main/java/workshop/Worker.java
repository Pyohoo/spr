package workshop;

public class Worker {
    public static void main(String[] args) {
        Tool narzedzie = new Tool("wiertarka");
        narzedzie.useTool();

        Tool[] szopa = new Tool[3];

        // Tworzymy obiekty i umieszczamy je w tablicy
        szopa[0] = new Tool("młot");
        szopa[1] = new Tool("śrubokręt");
        szopa[2] = new Tool("łom");

        for (Tool tool : szopa) {
            tool.useTool();
        }

    }
}
