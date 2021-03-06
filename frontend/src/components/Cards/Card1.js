import React from 'react';
import card1 from '../../assets/images/card1.png';
import classes from './Card1.css'

const card = (props) => (
  <div className={classes.Wrapper}>
    <div className={classes.LeftContent}>
      <img src={props.image} alt=""></img>
    </div>
    <div className={classes.RightContent}>
      {props.text}
    </div>
  </div>
)

export default card;