import React, { Component } from "react";
import { Button, ButtonGroup, Container, Table } from "reactstrap";


class EmployeeApi extends Component
{
    constructor(props)
    {
        super(props);
        this.state = {employees:[]};
    }

    componentDidMount()
    {
        fetch('/employees')
        .then(response => response.json())
        .then(data => this.setState({employees:data}));
    }

    render()
    {
        return (
            <EmployeeList employees={this.state.employees}/>
        )
    }
}

class EmployeeList extends Component
{
    render()
    {
        const employees = this.props.employees.map(employee => <Employee key = {employee.id} employee = {employee}>
        </Employee>);

        return (
            <div>
            <h3>Employees</h3>
            <Table className="mt-4">
                <tbody>
                    <tr>
                        <th width = "30%">First Name</th>
                        <th width = "30%">Last Name</th>
                        <th width = "40%">Description</th>
                    </tr>
                    {employees}
                </tbody>
            </Table>
            </div>
        )
    }
}

class Employee extends Component
{
    render()
    {
        return(
            <tr>
                <td>{this.props.employee.firstName}</td>
                <td>{this.props.employee.lastName}</td>
                <td>{this.props.employee.description}</td>
            </tr>
        )
    }
}

export default EmployeeApi;