import { getByLabelText } from '@testing-library/react';
import React from 'react';

export default class Values extends React.Component {
  render() {
    return (
      <div>
        <div>

          <label for="newValue">Value</label>
          <input type="text" id="newValue" name="newValue" onChange={this.props.newValuechange}></input>
          <button onClick={this.props.addValue}>Add Value</button>
          <button onClick={this.props.deleteValue}>Delete Value</button>
        </div>
        <div>{this.props.values}</div>  
        <button onClick={this.props.onGetValues}>Get Values!</button>
      </div>
    );
  }
}