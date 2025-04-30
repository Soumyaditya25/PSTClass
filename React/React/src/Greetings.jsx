import {Component} from 'react';

class Greetings extends Component {
    static defaultProps = {
        name: 'Somuu',
    }
    render() {
        return (
            <div>
                <h1>Hello, {this.props.name}!</h1>
                <p>{this.props.children}</p>
            </div>
        );
    }
}

export default Greetings;