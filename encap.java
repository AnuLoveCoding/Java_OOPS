public class encap {
    private String name; // ! private = restricted access;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    
}

// * class sukk extends encap {
//     public static void main(String[] args) {
//         encap myObj = new encap();
//         myObj.setName("Anurag");
//         System.out.println(myObj.getName());
//     }
// }
