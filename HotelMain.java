import java.util.*;

class Hotel {
    private int roomno;
    private String roomType;
    private int capacity;
    private double pricePerNight;
    private boolean isAvailable;

    public Hotel(int roomno, String roomType, int capacity, double pricePerNight, boolean isAvailable) {
        this.roomno = roomno;
        this.roomType = roomType;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.isAvailable = isAvailable;
    }

    public int getRoomno() {
        return roomno;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

public class HotelMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of Hotel objects
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // Create a list of Hotel objects
        List<Hotel> hotels = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int roomno = sc.nextInt();
            sc.nextLine(); // Consume the newline
            String roomType = sc.nextLine();
            int capacity = sc.nextInt();
            double pricePerNight = sc.nextDouble();
            boolean isAvailable = sc.nextBoolean();

            hotels.add(new Hotel(roomno, roomType, capacity, pricePerNight, isAvailable));
        }

        // Read room id to search for booking
        int roomid = sc.nextInt();

        // Call the methods and display results
        Hotel bookedHotel = roomBookingByUsingRoomNo(hotels, roomid);
        if (bookedHotel != null) {
            System.out.println("Room No: " + bookedHotel.getRoomno());
            System.out.println("Room Type: " + bookedHotel.getRoomType());
            System.out.println("Capacity: " + bookedHotel.getCapacity());
            System.out.println("Price: " + bookedHotel.getPricePerNight());
        } else {
            System.out.println("No room found with given attributes");
        }

        Hotel maxCapacityHotel = findMaxCapacityRoomsBasedOnAvailability(hotels);
        if (maxCapacityHotel != null) {
            System.out.println("Room No: " + maxCapacityHotel.getRoomno());
            System.out.println("Room Type: " + maxCapacityHotel.getRoomType());
            System.out.println("Capacity: " + maxCapacityHotel.getCapacity());
            System.out.println("Price: " + maxCapacityHotel.getPricePerNight());
        } else {
            System.out.println("Rooms are not available");
        }
    }

    public static Hotel roomBookingByUsingRoomNo(List<Hotel> hotels, int roomid) {
        for (Hotel hotel : hotels) {
            if (hotel.getRoomno() == roomid && hotel.isAvailable()) {
                hotel.setAvailable(false); // Update availability
                return hotel;
            }
        }
        return null; // Room not found or not available
    }

    public static Hotel findMaxCapacityRoomsBasedOnAvailability(List<Hotel> hotels) {
        Hotel maxCapacityHotel = null;
        for (Hotel hotel : hotels) {
            if (hotel.isAvailable()) {
                if (maxCapacityHotel == null || hotel.getCapacity() > maxCapacityHotel.getCapacity()) {
                    maxCapacityHotel = hotel;
                }
            }
        }
        return maxCapacityHotel; // Returns null if no rooms are available
    }
}



// import java.util.ArrayList;
// import java.util.Scanner;


// class Hotel
// {
//     int roomno;
//     String roomType;
//     int capacity;
//     double pricePernight;
//     boolean isAvailable;

//     public Hotel( int roomno,String roomType,int capacity,double pricePernight,boolean isAvailable)
//     {
//          this.roomno = roomno;
//          this.roomType = roomType;
//          this.capacity = capacity;
//          this.pricePernight = pricePernight;
//          this.isAvailable = isAvailable;
//     }

//     public int getroomno()
//     {
//       return roomno;
//     }
//     public void setroomno(int newroomno)
//     {
//         this.roomno = newroomno;
//     }

//     public String getroomtype()
//     {
//         return roomType;
//     }
//     public void setroomtype(String newroomtype)
//     {
//         this.roomType = newroomtype;
//     }

//     public int getcapacity()
//     {
//         return capacity;
//     }
//     public void setcapacity(int newcapacity)
//     {
//         this.capacity = newcapacity;
//     }

//     public double getpricepernight()
//     {
//         return pricePernight;
//     }
//     public void setpricepernight(double newpricepernight)
//     {
//         this.pricePernight = newpricepernight;
//     }

//     public boolean getisAvailable()
//     {
//         return isAvailable;
//     }
//     public void setisAvailable(boolean  newisavailable)
//     {
//         this.isAvailable = newisavailable;
//     }

// }
// public class HotelMain {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         ArrayList<Hotel> array = new ArrayList<>();

//         for(int i = 0 ; i < N ; i++)
//         {
//             int no = sc.nextInt();sc.nextLine();
//             String type = sc.nextLine();
//             int capacity = sc.nextInt();
//             double pricePernight = sc.nextDouble();
//             boolean isAvailable = sc.nextBoolean();

//           array.add(new Hotel(no, type, capacity, pricePernight, isAvailable));
//         }
//         int findRoomNo = sc.nextInt();


//     }
//     public static ArrayList<Hotel> roomBookingByUsingRoomNo(ArrayList<Hotel> array , int findRoomNo)
//     {
//       ArrayList<Hotel> result = new  ArrayList<>();
//       for(Hotel e : array)
//       {
//         if(e.getroomno() == findRoomNo && e.getisAvailable() == true)
//         {
//             result.add(e);
//             e.setisAvailable(false);
//             return e;
//         }
//       }
//       return null;
//     }
// pub

    
// }
