public class Back {
    No root = null;

    private void add(No no, int key) {
        if(root == null)
            root = new No(key);
        else
            if(key < no.key)
                if(no.left == null)
                    no.left = new No(key);
                else
                    add(no.left, key);
            else
                if(no.right == null)
                    no.right = new No(key);
                else
                    add(no.right, key);
    }

    public void add(int key) {
        add(root, key);
    }

    public No remove(No no, int key) throws Exception {
        if(root == null || no == null)
            throw new Exception("Empty tree.");
        else {
            boolean ajust = false;
            if(key < no.key)
                no.left = remove(no.left, key);
            else if(key > no.key)
                no.right = remove(no.right, key);
            else {
                if(no.right != null && no.left != null) {
                    no.key = min(no.right).key;
                    no.right = removeMin(no.right);
                } else {
                    if(no == root)
                        ajust = true;
                    
                    no = (no.left != null) ? no.left : no.right;

                    if(ajust)
                        root = no;
                }
            }
            return no;
        }
    }

    public No remove(int key) throws Exception {
        return remove(root, key);
    }

    private boolean search(No no, int key) {
        if(no == null)
            return false;
        else
            if(key < no.key)
                return search(no.left, key);
            else if(key > no.key)
                return search(no.right, key);
            else
                return true;
    }

    public boolean search(int key) {
        return search(root, key);
    }

    private No min(No no) throws Exception {
        if(no == null)
            throw new Exception("Empty tree.");
        if(no.left != null)
            return min(no.left);
        else
            return no;
    }

    private No removeMin(No no) throws Exception {
        if(no == null)
            throw new Exception("Empty tree.");
        else
            if(no.left != null) {
                no.left = removeMin(no.left);
                return no;
            } else
                return no.right;
    }

    private void inOrder(No no) {
        if(no != null) {
            inOrder(no.left);
            System.out.print(no.key + " ");
            inOrder(no.right);
        }
    }

    public void inOrder() {
        inOrder(root);
    }
}
