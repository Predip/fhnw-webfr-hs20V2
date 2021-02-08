import React, { Component } from "react";
import { Button } from 'reactstrap';

class App extends Component {
  constructor(props) {
    super(props);
    this.names = [
      "Balin",
      "Dwalin",
      "Fili",
      "Kili",
      "Dori",
      "Nori",
      "Ori",
      "Oin",
      "Gloin",
      "Bifur",
      "Bofur",
      "Bombur",
    ];
    this.state = {
        index: 0,
    };
    this.tick = this.tick.bind(this);
    this.reset = this.reset.bind(this);
  }
  tick() {
    const newIndex = (this.state.index + 1) % this.names.length;
    this.setState({ index: newIndex });
  }
  reset() {
    this.setState({ counter: 0 });
  }
  render() {
    return (
        <div>
          <div className="jumbotron">
            <h1>{this.props.message} {this.names[this.state.index]}</h1>
          </div>

          <Button color="primary" onClick={this.tick}>INCR</Button>
          <Button color="secondary" onClick={this.reset}>REFRESH</Button>
        </div>

    );
  }
}
export default App;
