# Parking-Garage
The aim of this application is to be able to manage garages which provides spot to park vehicles of different sizes (small, medium, large).

## Data model
Each garage identified by:
- name: name of the garage, must be unique
- price per hour for each size of spot
A garage contains multiple spots.

Each spot identified by:
- number: number of the spot, must be unique
- size: small or medium or large

Each vehicle identified by: 
- plate number: must be unique
- size: small or medium or large 

Each reservation for a defined for a dedicated spot and vehicle, identified by:
- reservation number: must be unique
- startDatetime: datetime
- endDatetime: datetime
- paid: yes or no
- status: booked, cancel  

## Functionalities
The application must provide the following functionalities (REST API):
1. CRUD on Garage, Spot, Vehicle
2. Find available spots: return a list of available spots
3. Book a spot: return a reservation with a provisional price
4. Cancel a reservation
5. Compute the total revenue per day per garage
6. Be able to find reservation based on dynamic criteria: by vehicle plate number, type of vehicle, and reservation status each criteria being optional

## Additional notes

The application must manage the exception in a homogenous way by sending in the response an ErrorResource object.
The Error resource object is defined by: 
- code: internal error code
- message: short message of the error
- description: full description of the error
- timestamp: datetime of the error