public class Back {
    private No root = null;

    private void add(No no, int year, float temp) {
        if(root == null)
            root = new No(year, temp);
        else
            if(temp < no.temp)
                if(no.left == null)
                    no.left = new No(year, temp);
                else
                    add(no.left, year, temp);
            else
                if(no.right == null)
                    no.right = new No(year, temp);
                else
                    add(no.right, year, temp);
    }

    public void add(int year, float temp) {
        add(root, year, temp);
    }

    private No max(No no, int year) {
        if(no.right == null)
            return no;
        else
            return max(no.right, year);
    }

    public String isMax(int year) {
        if(max(root, year).year == year)
            return "Correto";
        return "Incorreto";
    }
}
