import React from "react";

function App() {

  const office = {
    Name: "Smart Office",
    Rent: 55000,
    Address: "Madhapur, Hyderabad",
    Image: "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=800"
  };

  const officeList = [
    {
      Name: "Smart Office",
      Rent: 55000,
      Address: "Hyderabad",
      Image: "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=800"
    },
    {
      Name: "Tech Park",
      Rent: 75000,
      Address: "Bangalore",
      Image: "https://images.unsplash.com/photo-1497366412874-3415097a27e7?w=800"
    },
    {
      Name: "Business Hub",
      Rent: 45000,
      Address: "Chennai",
      Image: "https://images.unsplash.com/photo-1497366216548-37526070297c?w=800"
    }
  ];

  return (
    <div style={{ padding: "20px" }}>

      <h1>Office Space Rental App</h1>

      <img
        src={office.Image}
        alt="Office"
        width="350"
        height="220"
      />

      <h2>Name: {office.Name}</h2>

      <h3
        style={{
          color: office.Rent < 60000 ? "red" : "green"
        }}
      >
        Rent: ₹{office.Rent}
      </h3>

      <h3>Address: {office.Address}</h3>

      <hr />

      <h2>Available Office Spaces</h2>

      {
        officeList.map((item, index) => (
          <div
            key={index}
            style={{
              border: "1px solid gray",
              margin: "10px",
              padding: "10px",
              width: "350px"
            }}
          >
            <img
              src={item.Image}
              alt="Office"
              width="300"
              height="180"
            />

            <h3>{item.Name}</h3>

            <p
              style={{
                color: item.Rent < 60000 ? "red" : "green"
              }}
            >
              Rent: ₹{item.Rent}
            </p>

            <p>Address: {item.Address}</p>

          </div>
        ))
      }

    </div>
  );
}

export default App;