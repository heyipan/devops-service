export default ((id, type) => ({
  autoQuery: false,
  selection: false,
  paging: false,
  transport: {
    read: {
      method: 'get',
    },
  },
}));