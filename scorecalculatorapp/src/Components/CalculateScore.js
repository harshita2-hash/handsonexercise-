import React from "react";
import "../Stylesheets/mystyle.css";

function CalculateScore() {

    const Name = "Harshita";
    const School = "Vignan Institute of Engineering for Women";
    const Total = 500;
    const Goal = 450;

    const Average = (Goal / Total) * 100;

    return (
        <div className="container">
            <h1>Student Management Portal</h1>

            <h2>Student Details</h2>

            <p><b>Name:</b> {Name}</p>

            <p><b>School:</b> {School}</p>

            <p><b>Total Marks:</b> {Total}</p>

            <p><b>Marks Obtained:</b> {Goal}</p>

            <h3>Average Score: {Average}%</h3>
        </div>
    );
}

export default CalculateScore;