import React, {Component} from 'react';
import classes from './Trade.css';
import Chart from './CandleSticks/Chart';
import { getData } from "./CandleSticks/utils";

import { TypeChooser } from "react-stockcharts/lib/helper";

class Trade extends Component {
	componentDidMount() {
		getData().then(data => {
			this.setState({ data })
		})
	}
	render() {
		if (this.state == null) {
			return <div>Loading...</div>
		}
		return (
			<TypeChooser>
				{type => <Chart type={type} data={this.state.data} />}
			</TypeChooser>
		)
	}

}

export default Trade;