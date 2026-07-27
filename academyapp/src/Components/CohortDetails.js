import React from "react";
import styles from "../Style.module.css";

function CohortDetails(props) {
    return (
        <div className={styles.box}>

            <h2>{props.name}</h2>

            <h3
                style={{
                    color: props.status === "ongoing" ? "green" : "blue"
                }}
            >
                {props.status}
            </h3>

            <dl>
                <dt>Coach</dt>
                <dd>{props.coach}</dd>

                <dt>Trainer</dt>
                <dd>{props.trainer}</dd>
            </dl>

        </div>
    );
}

export default CohortDetails;