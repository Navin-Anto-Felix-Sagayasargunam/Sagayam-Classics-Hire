Sagayam Classics Car Rental System
Welcome to Sagayam Classics, where vintage elegance meets streamlined technology! This Java-based application is your ultimate tool for managing the hiring and servicing of timeless classic cars. Designed with a user-friendly interface, Sagayam Classics ensures efficiency, simplicity, and a touch of old-world charm for users looking to rent or service classic cars.

Features
Vintage Car Management
Explore a curated selection of classic cars available for hire, complete with essential details such as model, daily rate, and odometer readings.

Seamless Hiring Experience
Hire a car effortlessly by entering the car ID and hirer's name. The system verifies availability and updates the status in real-time.

Efficient Service & Returns
Return hired cars and calculate rental charges based on mileage, duration, and special corporate discounts.

Corporate Discounts
Unlock exclusive discounts for corporate customers based on their organization and professional designation.

Reliable Data Persistence
All car details and rental transactions are saved to a text file, ensuring data consistency and seamless operations.

Getting Started
Follow these steps to begin your journey with Sagayam Classics:

Clone the Repository

git clone https://github.com/yourusername/sagayam-classics.git
Navigate to the Project Directory

cd sagayam-classics
Compile the Java Files

javac ManageHiring.java
Launch the Application

java ManageHiring
How It Works
Once launched, Sagayam Classics offers an intuitive interface:

View available classic cars for hire.

Enter the car ID to initiate the hiring or servicing process.

Follow simple on-screen instructions to complete transactions.

Charges are calculated instantly, factoring in mileage, duration, and applicable discounts.

Code Overview
DateTime Class
Handles all date and time functionalities, including calculating rental durations and date advancements.

ClassicCar Class
Represents classic cars with attributes like ID, model, daily rate, and status. Includes robust methods for hiring and returning cars.

ManageHiring Class
Serves as the backbone of the application, orchestrating user interactions and ensuring seamless workflow.
