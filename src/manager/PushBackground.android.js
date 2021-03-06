/*
 * Copyright (c) 2011-2021, Zingaya, Inc. All rights reserved.
 */

'use strict';

import LoginManager from './LoginManager';
import CallKitManager from './CallKitManager';

export default async message => {
  console.log(
    'PushBackground android: notification: ' + JSON.stringify(message),
  );
  LoginManager.getInstance().pushNotificationReceived(message.data);
  CallKitManager.receivedCallOnAndroid(message.data);
  return Promise.resolve();
};
