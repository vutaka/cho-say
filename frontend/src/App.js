import React from 'react';
import { BrowserRouter, Route, Link } from 'react-router-dom'
import { Layout, Menu, Icon,} from 'antd';
import EventRegisterPage from './components/EventRegisterPage'
import EventListPage from './components/EventListPage'
import './App.css';

const { SubMenu } = Menu;
const { Header, Content, Sider } = Layout;

const App = () => (
  <BrowserRouter>
   <Layout>
   <Header className="App-header">
      <h1>調整ちゃん</h1>
   </Header>
   <Layout>
     <Sider width={200} style={{ background: '#fff' }}>
       <Menu
         mode="inline"
         defaultSelectedKeys={[window.location.pathname]}
         defaultOpenKeys={['sub1']}
         style={{ height: '100%', borderRight: 0 }}>
         <SubMenu key="sub1" title={<span><Icon type="exclamation-circle" />イベント</span>}>
           <Menu.Item key="/eventList"><Link to='/eventList'>一覧</Link></Menu.Item>
           <Menu.Item key="/eventRegister"><Link to='/eventRegister'>登録</Link></Menu.Item>
         </SubMenu>
       </Menu>
     </Sider>
     <Layout style={{ padding: '24px' }}>
       <Content style={{
         background: '#fff', padding: 24, margin: 0, minHeight: 280,
       }}>
        <Route exact path='/' component={Home} />
        <Route path='/eventList' component={EventListPage} />
        <Route path='/eventRegister' component={EventRegisterPage} />
     
       </Content>
     </Layout>
   </Layout>
 </Layout>
 </BrowserRouter>
)

const Home = () => (
  <div>
    <h2>Home</h2>
    <p>調整できるよ！</p>
  </div>
)

export default App;
