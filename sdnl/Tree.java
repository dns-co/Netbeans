package projek.sdnl;

public class Tree { // merupakan class Tree

    private TreeNode root; // deklarasi atribut root yang bertipe TreeNode dan bersifat private

    /*
    Merupakan constructor dari class Tree
    constructor ini berfungsi untuk menginisialisasi atribut root dengan null
    */
    public Tree() {
        root = null;
    }

    /*
    Merupakan costructor dari class Tree yang memiliki parameter node yang bertipe TreeNode
    costructor ini berfungsi untuk menginisialisasi atribut root dengan parameter node,
    mengeset leftNode dengan null dan mengeset rightNode dengan null
    */
    public Tree(TreeNode node) {
        this.root = node;
        this.root.setLeftNode(null);
        this.root.setRightNode(null);

    }

    /*
    Merupakan method insertNode yang bertipe void dan memiliki parameter data yang bertipe Data
    Method ini berfungsi untuk menginsert node baru. Jika root == null maka data yang diinsert akan 
    menjadi root, tetapi jika root != null maka data akan ditambahkan di cabang kiri dari root apabila
    data yang ditambahkan tersebut lebih kecil dari root atau data akan ditambahkan di cabang kanan dari root 
    apabila data yang ditambahkan lebih besar dari root
    */
    public void insertNode(Data data) {
        if (getRoot() == null) {
            setRoot(new TreeNode(data));
        } else {
            getRoot().insert(data);
        }
    }

    /*
    Merupakan method delete yang bertipe boolean dan memiliki parameter data yang bertipe Data 
    method ini berfungsi untuk menghapus node yang memiliki 1 anak, 2 anak dan anak 
    */
    public boolean delete(Data data) {
        TreeNode bantu = getCurrent(data);
        TreeNode parent = getParent(data);
        if (bantu == null) {
            return false;
        } else if (bantu == root) {
            if (bantu == leaf(bantu)) {
                bantu = null;
            } else {
                if (bantu.getLeftNode() == null) {
                    root = bantu.getRightNode();
                } else if (bantu.getRightNode() == null) {
                    root = bantu.getLeftNode();
                } else {
                    TreeNode predecessor = getPredecessor(bantu);
                    TreeNode parentPredecessor = getParent(predecessor.getData());
                    bantu.setData(predecessor.getData());
                    if (parentPredecessor != bantu) {
                         if (predecessor.getLeftNode() != null) {
                            parentPredecessor.setRightNode(predecessor.getLeftNode());
                        } else {
                            parentPredecessor.setRightNode(null);

                        }
                    } else {
                        if (predecessor.getLeftNode() != null) {
                            bantu.setLeftNode(predecessor.getLeftNode());

                        } else {
                            bantu.setLeftNode(null);
                        }
                    }
                }
            }
            return true;

        } else {
            if (bantu == leaf(bantu)) {
                if (bantu.getData().getNo() > parent.getData().getNo()) {
                    parent.setRightNode(null);

                } else {
                    parent.setLeftNode(null);
                }
            } else {
                if (bantu.getLeftNode() == null) {
                    if (bantu.getRightNode().getData().getNo() > parent.getData().getNo()) {
                        parent.setRightNode(bantu.getRightNode());

                    } else {
                        parent.setLeftNode(bantu.getRightNode());
                    }
                } else if (bantu.getRightNode() == null) {
                    if (bantu.getLeftNode().getData().getNo() > parent.getData().getNo()) {
                        parent.setRightNode(bantu.getLeftNode());
                    } else {
                        parent.setLeftNode(bantu.getLeftNode());

                    }
                } else {
                    TreeNode predecessor = getPredecessor(bantu);
                    TreeNode parentPredecessor = getParent(predecessor.getData());
                    bantu.setData(predecessor.getData());
                    if (parentPredecessor != bantu) {
                        if (predecessor.getLeftNode() != null) {
                            parentPredecessor.setRightNode(predecessor.getLeftNode());

                        } else {
                            parentPredecessor.setRightNode(null);
                        }
                    } else {
                        if (predecessor.getLeftNode() != null) {
                            bantu.setLeftNode(predecessor.getLeftNode());
                        } else {
                            bantu.setLeftNode(null);
                        }
                    }

                }
            }
            return true;

        }
    }

    /*
    Merupakan method getCurrent yang bertipe TreeNode dan memiliki parameter data yang 
    bertipe data 
    method ini berfungsi untuk mengembalikan nilai dari hasil cari parameter data
    */
    public TreeNode getCurrent(Data data) {
        return search(data);
    }

    /*
    Merupakan method inorderTranversal yang bertipe void 
    method ini berfungsi untuk mejalankan dari method inorderHelper dengan parameter root
    */
    public void inorderTraversal() {
        inorderHelper(root);
    }

    /*
    Merupakan method inorderHelper yang bertipe void dan memiliki parameter localRoot yang bertipe Treenode 
    method ini berfungsi untuk melakukan kunjungan secara in order dengan syarat localRoot != null
    */
    public void inorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            inorderHelper(localRoot.getLeftNode());
            System.out.printf("%-16s", +localRoot.getData().getNo());
            System.out.printf("%-17s", localRoot.getData().getNama());
            System.out.printf("%-20s", localRoot.getData().getAlamat());
            System.out.printf("%-15s", localRoot.getData().getPekerjaan());
            System.out.printf("%-10s", +localRoot.getData().getJam() + " Jam ");
            System.out.println("");
            inorderHelper(localRoot.getRightNode());
        }

    }

    /*
    Merupakan method search yang bertipe TreeNode dan memiliki parameter key yang bertipe data 
    method ini berfungsi untuk mencari key pada BST. apabila root = null maka return null. 
    program akan melakukan perulangan selama root != null. apabila key = root maka return bantu, jika key lebih besar dari root 
    maka  bantu = bantu.getRightNode()atau mencari di cabang kanan dari root dan jika key > root maka bantu = bantu.getLeftNode()
    atau mencari dicabang kiri dari root
    */
    public TreeNode search(Data key) {
        TreeNode bantu = root;
        if (root == null) {
            return null;
        } else {
            while (bantu != null) {
                if (key.getNo() == bantu.getData().getNo()) {
                    return bantu;
                } else {
                    if (key.getNo() > bantu.getData().getNo()) {
                        bantu = bantu.getRightNode();

                    } else {
                        bantu = bantu.getLeftNode();
                    }

                }
            }

        }
        return null;
    }

    /*
    merupakan method getRoot yang bertipe TreeNode 
    method ini berfungsi untuk mengembalikan nilai dari atribut root
    */
    public TreeNode getRoot() {
        return root;
    }

    /*
    merupakan method setRoot yang bertipe void dan memiliki parameter root yang bertipe TreeNode
    method ini berfungsi untuk menginisialisasi atribut root dengan parameter root 
    */
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /*
    Merupakan method leaf yang bertipe TreeNode dan memiliki parameter data yang bertipe TreeNode 
    apabila bantu.getLeftNode() == null && bantu.getRightNode() == null maka return bantu, jika tidak maka 
    return null
    */
    public TreeNode leaf(TreeNode data) {
        TreeNode bantu = search(data.getData());
        if (bantu.getLeftNode() == null && bantu.getRightNode() == null) {
            return bantu;
        } else {
            return null;

        }
    }

    /*
    Merupakan method getParent yang bertipe TreeNode dan memiliki parameter key yang bertipe Data
    method ini berfungsi untuk mencari parent dari key. Akan melakukan perulangan selama root != null 
    jika bantu.getData().getNo() == key.getNo()maka return bantu, jika bantu.getData().getNo() > key.getNo()maka
     parent = bantu dan  bantu = bantu.getLeftNode(), jika bantu.getData().getNo() < key.getNo() maka  parent = bantu
    dan bantu = bantu.getRightNode(). Apabila root == null maka return null
    */
    public TreeNode getParent(Data key) {
        TreeNode bantu = root;
        TreeNode parent = null;
        while (bantu != null) {
            if (bantu.getData().getNo() == key.getNo()) {
                return parent;
            } else if (bantu.getData().getNo() > key.getNo()) {
                parent = bantu;
                bantu = bantu.getLeftNode();
            } else {
                parent = bantu;
                bantu = bantu.getRightNode();

            }
        }
        return null;
    }

    /*
    Merupakan method getPredecessor yang bertipe TreeNode dan memiliki parameter key yang bertipe TreeNode
    method ini berfungsi untuk mencari predecessor dari key. Apabila root = null maka kembalikan nilai null
    apabila root != null maka melakukan perulangan selama bantu = bantu.getRightNode != null dan return bantu
    */
    public TreeNode getPredecessor(TreeNode key) {
        if (root == null) {
            return null;
        } else {
            TreeNode bantu = key;
            bantu = bantu.getLeftNode();
            while (bantu.getRightNode() != null) {
                bantu = bantu.getRightNode();
            }
            return bantu;
        }
    }
}
