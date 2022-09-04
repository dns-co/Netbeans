package projek.sdnl;

public class TreeNode { // merupakan class Tree Node
    private Data data; // deklarasi atribut data dengan tipe data class Data dan bersifat private 
    private TreeNode leftNode; // deklarasi atribut leftNode dengn tipe data TreeNode dan bersifat private
    private TreeNode rightNode; // deklarasi atribut rightNode dengan tipe data TreeNode dan bersifat private
    private TreeNode parent; // deklarasi atribut parent dengan tipe data TreeNode yang bersifat private
    
    /*
    Merupakan costructor dari class TreeNode dengan parameter data yang bertipe Data
    constructor ini berfungsi untuk menginisialisasi atribut data dengan parameter data
    */
    public TreeNode(Data data){
        this.data = data;
    }

    /*
    merupakan method getData yang bertipe Data
    method ini berfungsi untuk mengembalikan nilai dari atribut data
    */
    public Data getData() { 
        return data; 
    }

    /*
    merupakan method setData yang bertipe void dan mempunyai parameter data yang bertipe Data
    mrthod ini berfungsi utnuk menginisialisasi atribut data dengan parameter data
    */
    public void setData(Data data) {
        this.data = data;
    }

     /*
    merupakan method getLeftNode yang bertipe TreeNode
    method ini berfungsi untuk mengembalikan nilai dari atribut leftNode
    */
    public TreeNode getLeftNode() {
        return leftNode;
    }

     /*
    merupakan method setLeftNode yang bertipe void dan mempunyai parameter leftNode yang bertipe TreeNode
    mrthod ini berfungsi utnuk menginisialisasi atribut leftNode dengan parameter leftNode
    */
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

      /*
    merupakan method getLRightNode yang bertipe TreeNode
    method ini berfungsi untuk mengembalikan nilai dari atribut rightNode
    */
    public TreeNode getRightNode() {
        return rightNode;
    }

       /*
    merupakan method setRighttNode yang bertipe void dan mempunyai parameter rightNode yang bertipe TreeNode
    mrthod ini berfungsi utnuk menginisialisasi atribut rightNode dengan parameter rightNode
    */
    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

      /*
    merupakan method getParent yang bertipe TreeNode
    method ini berfungsi untuk mengembalikan nilai dari atribut parent
    */
    public TreeNode getParent() {
        return parent;
    }

       /*
    merupakan method setParent yang bertipe void dan mempunyai parameter parent yang bertipe TreeNode
    mrthod ini berfungsi utnuk menginisialisasi atribut parent dengan parameter parent
    */
    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
    
    /*
    merupakan method insert yang bertipe void dan memiliki parameter data yang bertipe Data
    method ini berfungsi untuk menginsert data. Apabila data yang diinsert lebih besar dari root 
    maka data ditambahkan ke cabang kanan, jika sebaliknya maka data ditambahkan dicabang kiri
    */
    public void insert(Data data){
        if (data.getNo()> getData().getNo()) {
            if (getRightNode() == null) {
                setRightNode(new TreeNode(data));
            }else{
                getRightNode().insert(data);
                
            } 
        }else {
            if (getLeftNode()== null) {
                setLeftNode(new TreeNode (data));
            }else{
                getLeftNode().insert(data);
                
            }
        }
    }
     
    
}
