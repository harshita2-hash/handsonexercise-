import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Virat Kohli", score: 90 },
        { name: "Rohit Sharma", score: 82 },
        { name: "Shubman Gill", score: 65 },
        { name: "KL Rahul", score: 55 },
        { name: "Hardik Pandya", score: 72 },
        { name: "Ravindra Jadeja", score: 68 },
        { name: "R Ashwin", score: 80 },
        { name: "Mohammed Shami", score: 40 },
        { name: "Jasprit Bumrah", score: 77 },
        { name: "Kuldeep Yadav", score: 61 },
        { name: "Surya Kumar Yadav", score: 88 }
    ];

    const below70 = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>List of Players</h2>

            {players.map((player, index) => (
                <div key={index}>
                    {player.name} - {player.score}
                </div>
            ))}

            <h2>Players with Score below 70</h2>

            {below70.map((player, index) => (
                <div key={index}>
                    {player.name} - {player.score}
                </div>
            ))}

        </div>
    );
}

export default ListofPlayers;