import java.util.Scanner;

class Product {

    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }


    void display() {

        System.out.println(
            "Product ID : " + productId +
            ", Name : " + productName +
            ", Category : " + category
        );
    }
}


public class ProductSearch {


    // Linear Search

    public static Product linearSearch(Product products[], int id) {

        for(int i=0;i<products.length;i++) {

            if(products[i].productId == id) {

                return products[i];
            }
        }

        return null;
    }



    // Binary Search

    public static Product binarySearch(Product products[], int id) {


        int low = 0;
        int high = products.length-1;


        while(low <= high) {


            int mid = (low+high)/2;


            if(products[mid].productId == id) {

                return products[mid];
            }


            else if(products[mid].productId < id) {

                low = mid + 1;
            }


            else {

                high = mid - 1;
            }

        }


        return null;
    }



    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);



        // Array for Linear Search

        Product products[] = {


            new Product(105,"Laptop","Electronics"),
            new Product(102,"Mobile","Electronics"),
            new Product(108,"Shoes","Fashion"),
            new Product(101,"Watch","Accessories"),
            new Product(110,"Bag","Fashion")

        };



        // Sorted Array for Binary Search

        Product sortedProducts[] = {


            new Product(101,"Watch","Accessories"),
            new Product(102,"Mobile","Electronics"),
            new Product(105,"Laptop","Electronics"),
            new Product(108,"Shoes","Fashion"),
            new Product(110,"Bag","Fashion")

        };



        System.out.print("Enter Product ID to search: ");

        int id = sc.nextInt();



        System.out.println("\nLinear Search Result:");

        Product result1 = linearSearch(products,id);


        if(result1!=null)

            result1.display();

        else

            System.out.println("Product Not Found");





        System.out.println("\nBinary Search Result:");

        Product result2 = binarySearch(sortedProducts,id);


        if(result2!=null)

            result2.display();

        else

            System.out.println("Product Not Found");



        sc.close();

    }
}