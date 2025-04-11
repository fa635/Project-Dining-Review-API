# Dining Review API

This is a Spring Boot RESTful API for managing dining reviews with features like creating reviews, managing review statuses, and fetching reviews by status or restaurant.

## Features

- **User**: Create users and register their allergies.
- **Dining Reviews**: Users can create dining reviews for restaurants.
- **Admin Review Management**: Admins can approve or reject reviews and manage review statuses.
- **Search & Filtering**: Admins can filter reviews based on restaurant and review status.
- **Restaurant Management**: Allows for restaurant data management and fetching of reviews for specific restaurants.

## Models

### 1. **User**
- Represents a user in the system.
- Contains information like `username`, `city`, `state`, `zip code`, and allergy preferences (`peanut`, `egg`, `dairy`).

### 2. **Restaurant**
- Represents a restaurant.
- Contains restaurant details like name and allergen scores (peanut, egg, dairy, overall score).

### 3. **DiningReview**
- Represents a dining review.
- Includes review scores for peanut, egg, and dairy allergies along with a commentary.
- Review statuses include `PENDING`, `APPROVED`, and `REJECTED`.

### 4. **AdminReviewAction**
- Used for admin actions to update review statuses (approved or rejected).

### 5. **ReviewStatus Enum**
- Defines the statuses for a review:
  - `PENDING`: Review is pending approval.
  - `APPROVED`: Review has been approved.
  - `REJECTED`: Review has been rejected.

## API Endpoints

### 1. **User Endpoints**

- **Create User**:  
  `POST /user`  
  Creates a new user with the provided details.

- **Update User**:  
  `PUT /user/{id}`  
  Updates user details such as city, state, zip code, and allergy preferences.

- **Get User by Username**:  
  `GET /user/{username}`  
  Retrieves a user based on the provided username.

### 2. **Restaurant Endpoints**

- **Create Restaurant**:  
  `POST /restaurant`  
  Adds a new restaurant.

- **Get Restaurant by ID**:  
  `GET /restaurant/{restaurantID}`  
  Fetches a restaurant by its ID.

- **Get Approved Reviews for Restaurant**:  
  `GET /restaurant/approved-reviews/{restaurantID}`  
  Fetches all approved reviews for a specific restaurant.

### 3. **Dining Review Endpoints**

- **Create Dining Review**:  
  `POST /dining-review`  
  Allows users to create dining reviews for a restaurant.

- **Get Pending Reviews**:  
  `GET /dining-review/pending`  
  Fetches all reviews that are pending approval.

- **Update Review Status**:  
  `PUT /dining-review/{id}/{updatedStatus}`  
  Admins can update the status of a specific review to `APPROVED` or `REJECTED`.

## Running the Application

1. Clone the repository:
   ```bash
   git clone <repository-url>
    ```

2. Navigate to the project directory:
    ```bash
    cd Project_Dining_Review_API
    ```

3. Run the application:
    ```bash
    mvn spring-boot:run
    ```

4. The application will be available at `http://localhost:8080`.


## Database Configuration
The application uses an embedded H2 database for development. You can change this to any preferred database in application.properties.

## Dependencies
- Spring Boot
- Spring Data JPA
- H2 Database
- Lombok
- Jakarta Validation

## License
This project is licensed under the MIT License - see the LICENSE file for details.