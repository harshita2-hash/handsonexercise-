import React, { Component } from "react";
import GuestPage from "./Components/GuestPage";
import UserPage from "./Components/UserPage";

class App extends Component {

    constructor(props) {
        super(props);

        this.state = {
            isLoggedIn: false
        };
    }

    login = () => {
        this.setState({
            isLoggedIn: true
        });
    };

    logout = () => {
        this.setState({
            isLoggedIn: false
        });
    };

    render() {

        if (this.state.isLoggedIn) {

            return (
                <div style={{ margin: "20px" }}>

                    <button onClick={this.logout}>
                        Logout
                    </button>

                    <UserPage />

                </div>
            );
        }

        return (
            <div style={{ margin: "20px" }}>

                <button onClick={this.login}>
                    Login
                </button>

                <GuestPage />

            </div>
        );
    }
}

export default App;