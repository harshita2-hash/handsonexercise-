public class SearchOperations {




    // Linear Search by title

    Book linearSearch(Book books[], String title) {



        for(int i=0;i<books.length;i++) {



            if(books[i].title.equalsIgnoreCase(title)) {


                return books[i];

            }

        }



        return null;
    }





    // Binary Search by title

    Book binarySearch(Book books[], String title) {



        int low = 0;

        int high = books.length - 1;




        while(low <= high) {



            int mid = (low + high)/2;



            int result = books[mid].title.compareToIgnoreCase(title);




            if(result == 0) {


                return books[mid];

            }


            else if(result < 0) {


                low = mid + 1;

            }


            else {


                high = mid - 1;

            }

        }



        return null;
    }

}