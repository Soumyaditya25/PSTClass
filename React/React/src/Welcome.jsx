import { Component } from "react";

class Welcome extends Component{
    constructor(props){
        super(props);
        this.state = {count:0}
    }

    increment = () => {
        this.setState({count: this.state.count + 1})
    }

    decrement =() => {
        if(this.state.count > -10)
        this.setState({count: this.state.count - 1})
    }

    alertFunction = () => {
        alert("Reached the limit!")
    }


    render(){
        return (
            <>
            <div>
            <h1>Welcome, {this.props.name}.</h1>
            <h1>{this.state.count}</h1>
            <button onClick={this.state.count < 10 ? this.increment : this.alertFunction} style={{margin: "5px"}}>+</button>
            <button onClick={this.state.count > -10 ? this.decrement : this.alertFunction}  style={{margin: "5px" }}>-</button>
            </div>
            </>
        )
    }
}

export default Welcome