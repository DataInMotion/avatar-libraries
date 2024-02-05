
export const createPatient = {
  eClass: 'http://hl7.org/fhir/patient#//Patient',
  id: {
    value: 'fecd68e2-1dc8-45db-a8c7-9f7775ba6cd0'
  },
  meta: {
    lastUpdated: {
      value: '2024-02-05T20:08:01'
    }
  },
  text: {
    status: {
      value: 'empty'
    }
  },
  extension: [
    {
      valueCode: {
        value: 'renal'
      },
      url: 'http://example.org/consent#trials'
    }
  ],
  identifier: [
    {
      use: {
        value: 'usual'
      },
      type: {
        coding: [
          {
            system: {
              value: 'http://h17.org/fhir/v2/0203'
            },
            code: {
              value: 'MR'
            }
          }
        ]
      },
      system: {
        value: 'http://www.goodhealth.org/identifiers/mrn'
      },
      value: {
        value: 'ca9984a4-f1bf-476a-a944-0d978b3caf0e'
      }
    }
  ],
  active: {
    value: true
  },
  name: [
    {
      family: {
        value: 'Levin'
      },
      given: [
        {
          value: 'Henry'
        }
      ],
      suffix: [
        {
          value: 'The 7th'
        }
      ]
    }
  ],
  gender: {
    value: 'male'
  },
  birthDate: {
    value: '2024-02-05T20:08:01'
  },
  fakeId: 'fecd68e2-1dc8-45db-a8c7-9f7775ba6cd0',
  // this simply verifies that failure on unknown properties does not occur
  unknownObject1: {
    value: '2024-02-05T20:08:01'
  },
  unknownField1: 'fecd68e2-1dc8-45db-a8c7-9f7775ba6cd0'  
};

export const updatePatient = createPatient;

export const patientId = "fecd68e2-1dc8-45db-a8c7-9f7775ba6cd0";
